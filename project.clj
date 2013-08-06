(defproject clj-topics "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 ;; testing
                 [midje "1.5.1"]
                 ;; json serialization
                 [cheshire "5.1.1"]
                 ;; logging
                 [org.clojure/tools.logging "0.2.6"]
                 [ch.qos.logback/logback-classic "1.0.9"]
                 [org.slf4j/jul-to-slf4j "1.7.2"]
                 [org.slf4j/jcl-over-slf4j "1.7.2"]
                 [org.slf4j/log4j-over-slf4j "1.7.2"]]
  :profiles {:dev {;:jvm-opts ["-Xmx1g" "-server" "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005"]
                   :plugins [[lein-midje "3.0.0"]]}})
