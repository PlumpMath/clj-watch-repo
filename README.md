# doo-macro-example

This repo shows two issues with the `cljs.build.api/watch`

## Double recompile when using vi

Shows that `cljs.build.api/watch` function emits two events when using
vi due to `.swp` files.

To reproduce the behavior, download the
[cljs.jar](https://github.com/clojure/clojurescript/releases/download/r1.7.170/cljs.jar)
into the top directory, run

```sh
# start the build
./script/watch
# wait for the first build to finish
# keep the output of the terminal accessible
```

on another terminal window:
```sh
vi src/doo_macro_example/test.cljs
# edit and save the file _once_ and look at the watch process
# you should see double compilation:
Change detected, recompiling ...
... done. Elapsed 0.12435167 seconds
Change detected, recompiling ...
Compiling out/cljs/nodejs.cljs
Compiling src/doo_macro_example/test.cljs
... done. Elapsed 0.365261689 seconds
```

## Fail to watch macro files

Shows that the ClojureScript compiler doesn't watch macro.clj files.

To reproduce the behavior, download the
[cljs.jar](https://github.com/clojure/clojurescript/releases/download/r1.7.170/cljs.jar)
into the top directory, run

```sh
# start the build
./script/watch
# wait for the first build to finish
# now try running the result
node out/main.js
# you should see "hello!!!"
# now go and edit & save doo_macro_example/macros.clj
# check if the watch noticed
# run the result again to see if it updated
node out/main.js
# you see "hello!!!" again :(
```

## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
