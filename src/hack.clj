(ns hack)

(def lock (new Object))

(defn println
  "Thread-safe println."
  [& args]
  (locking lock
    (apply clojure.core/println args)))
