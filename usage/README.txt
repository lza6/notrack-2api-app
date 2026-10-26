usage.jsonl is created here at runtime.

usage-aggregate-cache-<kind>.json files are a restart accelerator: each one
stores one kind of the dashboard's incremental aggregates (snapshot,
by_account, analytics, series, remaining) together with the log offset it
covers, so the first refresh after a restart only reads the rows appended
since. One file per kind: a process only parses the kinds it actually serves,
and only rewrites the kinds that advanced. They are validated against the log
(offset, device/inode, tail signature) and against the price tables and realm
assignments when loaded; anything that does not match is ignored and the full
scan happens instead, so deleting these files is always safe. Set
WB_USAGE_CACHE=0 to turn them off entirely.

usage-aggregate-cache.json (no <kind>) is the single-file layout older builds
wrote. It is still read as a fallback for any kind that has no file of its
own, but it is never written or deleted; once every kind has been written once
it is simply ignored, and you can delete it safely.

usage-summary.json is a leftover from older builds, which rewrote it on every
request even though nothing ever read it back. New versions append to
usage.jsonl only; you can delete the old summary file safely.
