(ns doo-macro-example.runner
  (:require [cljs.test :as test]
            [cljs.nodejs :as nodejs]
            [doo-macro-example.test]))

(nodejs/enable-util-print!)

(set! *main-cli-fn*
  (fn [& args]
    (test/run-tests 'doo-macro-example.test)))
