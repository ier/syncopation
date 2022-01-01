# Prerequisites
1. manjaro linux
2. git
3. openjdk
4. lein (or clojure cli)

# Install qjack
$ sudo pacman -S qjackctl

# Install external supercollider
$ sudo pacman -S supercollider

# 1st terminal:
qjackctl 
"Setup" button > Settings > Parameters
Driver = alsa
Interface = hw:PCH
"Save"
"Start" button

# 2nd terminal:
$ lein new noises
$ cd noises

Add "[overtone "0.10.6"]" to the project.clj file dependencies key.

$ lein repl

;; boot the server
user=> (use 'overtone.live)

;; listen to the joys of a simple sine wave
user=> (demo (sin-osc))

;; https://github.com/overtone/overtone/issues/441
user=> (ol/demo (ol/sin-osc [440 440]))

;; or something more interesting...
user=> (demo 7 (lpf (mix (saw [50 (line 100 1600 5) 101 100.5]))
                   (lin-lin (lf-tri (line 2 20 5)) -1 1 400 4000)))
                   
                   
                   
References:
- http://openmusictheory.com/
- https://github.com/overtone/overtone
- http://overtone.github.io/docs.html#_installation
- https://clojureverse.org/t/overtone-anyone/6680/3
- https://github.com/pjagielski/disclojure
- https://github.com/ctford/leipzig
- https://gist.github.com/pjagielski/54195fa1ac9c753171bd0bbca6aa5942
- https://news.ycombinator.com/item?id=10181678
