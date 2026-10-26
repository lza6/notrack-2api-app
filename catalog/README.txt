product-config-<realm>.json is a runtime dump: the last /v3/config response
body the gateway fetched successfully from the upstream API (one file per
realm), kept as an on-disk copy of the most recent catalogue. Nothing reads
it back - the gateway always fetches on its own schedule - so deleting these
files is always safe; the next successful fetch rewrites them.
