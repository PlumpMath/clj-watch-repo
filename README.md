# doo-macro-example

Showcases that the ClojureScript compiler doesn't watch macro.clj files.

To reproduce the behavior, download the
[cljs.jar](https://github.com/clojure/clojurescript/releases/download/r1.7.170/cljs.jar)
into the top directory, run

```sh
# start the build
./script/watch
# wait for first build to finish
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
