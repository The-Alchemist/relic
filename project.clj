(defproject com.wotbrew/relic "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://github.com/wotbrew/relic"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :repl-options {:init-ns com.wotbrew.relic}
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[com.clojure-goes-fast/clj-async-profiler "0.5.1"]]}})