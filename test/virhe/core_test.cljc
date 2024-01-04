(ns virhe.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [virhe.core :as virhe]))

(deftest -printer-test
  (testing "function values can be printed"
    (is (virhe/-visit {:fn inc} (virhe/-printer)))))
