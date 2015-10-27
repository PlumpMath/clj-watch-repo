(ns doo-macro-example.runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [doo-macro-example.test]))

(doo-tests 'doo-macro-example.test)
