(ns test-seven.core
  (:require [clojure.test :refer :all]))

(deftest sums-to-seven
  (is (= 7 (+ 1 6)))
  (is (= 7 (+ 2 5)))
  (is (= 7 (+ 3 4))))
