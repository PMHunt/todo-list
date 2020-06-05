(defproject todo-list "0.1.0-SNAPSHOT"
  :description "Todo webapp, based on Practicalli, learning Ring/Compojure"
  :url "https://github.com/PMHunt/todo-list"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring "1.8.1"]]
  :repl-options {:init-ns todo-list.core}
  :main todo-list.core
  :profiles {:dev {:main todo-list.core/-dev-main}})
