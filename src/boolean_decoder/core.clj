(ns boolean-decoder.core
  (:gen-class))

(defn decode []
  (println "Hello, Welcome to the boolean decoder!")
  (println "Please, enter the value to decode:")
  (let [encoded-val (read-line)]
    (cond
      (= "1" encoded-val) (println true)
      (= "0" encoded-val) (println false)
      (= "" encoded-val) (println "Please, enter a number between (1 or 0).")
      (not= Integer encoded-val) (println "Please, enter a number...")
      :default ""
      )
    )
  )

(defn -main []
  (decode))
