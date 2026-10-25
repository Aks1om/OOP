#!/usr/bin/env bash
set -euo pipefail

# Packages in this plain-javac project mirror paths relative to its root.
# Do not use ZED_SYMBOL: it may be absent or refer to the main method itself.
root=$(realpath -- "$(dirname -- "${BASH_SOURCE[0]}")/..")
file=$(realpath -e -- "${1:?Expected the current Java file path}")
shift
case "$file" in
    "$root"/pr[1-4]/*.java) relative=${file#"$root"/} ;;
    *) printf '%s\n' 'Run a Java main in pr1/ through pr4/. Root pr4.java is an unsupported draft.' >&2; exit 1 ;;
esac
main=${relative%.java}
main=${main//\//.}

# Fresh output prevents stale classes; javac discovers only required sources.
out=$(mktemp -d /tmp/zed-oop-java.XXXXXXXX)
trap 'rm -rf -- "$out"' EXIT
cd -- "$root"
printf 'Compiling %s\n' "$relative"
javac -encoding UTF-8 -classpath "$out" -sourcepath "$root" -d "$out" "$file"
printf 'Running %s\n' "$main"
java -cp "$out" "$main" "$@"
