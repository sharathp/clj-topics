(ns clj-topics.core-test
  (:use midje.sweet)
  (:require [clj-topics.core :as core]))

(facts "Initialization"
  (fact "Success"
    (core/init) => truthy))