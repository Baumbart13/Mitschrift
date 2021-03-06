Control Theory Game - using Godot
================

- Godot-application from godot-website
	- [Windows](https://godotengine.org/download/windows)
	- [Linux](https://godotengine.org/download/linux)
	- [macOS](https://godotengine.org/download/osx)
- Godot-application from local repository
	- [Windows](Godot_v3.4-stable_win64.exe)
- [Additional info](.) about the game
- [Official repository](https://github.com/csaf4370/CTG)


### What is needed:

- Name of Game
   - CTG (=Control Theory Game)?
- Assets
- Models
- Graphics
- Logic
- Level
   - Self-balancing robot?
- For development and debugging, just start right into the level
- Knobs like seen on [QUASAR](https://quasar.dev/vue-components/knob)
- Physics
- 2D or 3D?
   - we don't know yet
- Programming Languages
   - GDScript?
   - C++?
   - Rust?
   - others?

Supported Platforms
====

- Desktop
- Mobile


Level - Self-balancing robot
----

- While still standing and no governors acting, robot will fall into horizontal
- Sensors are being placed
   - slope
   - acceleration
- Governors act according to sensor-data
- Robot has to try to stay vertical
- Disturbance variables can interrupt the robot's vertical state


Governors
----

- Lower the plant (Störgröße)
- Different governors have different prices
- Each governor acts a bit different


Disturbance variables
----

- Increase the plant (Störgröße)


Plant
----

- The higher it is, the more likely the robot will fall
- The higher it is, the more Governors are needed