(ns boolean-decoder.core
  (:gen-class))

(defn decode []
  (println "Hello, Welcome to the boolean decoder!")
  (println "Please, enter the value to decode:")
  (let [encoded-val (Integer/parseInt (read-line))]
    (if (= 1 encoded-val)
      (println true))
    )
  )

(defn -main []
  (decode))
