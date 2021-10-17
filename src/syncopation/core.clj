(ns syncopation.core
  (:require
   [overtone.live :refer [demo sin-osc lpf mix saw line lin-lin lf-tri]])
  (:gen-class))


(defn play []
  (do
    (demo (sin-osc [440 440]))
    (demo 7 (lpf (mix (saw [50 (line 100 1600 5) 101 100.5]))
                 (lin-lin (lf-tri (line 2 20 5)) -1 1 400 4000)))))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
