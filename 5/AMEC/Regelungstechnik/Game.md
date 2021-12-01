Regelungstechnik
================

### What is needed:

- Assets
- Models
- Graphics
- Logic
- Level
   - Self-balancing robot?
- For development and debugging, just start right into the level
- Knobs like seen on [QUASAR](https://quasar.dev/vue-components/knob)

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

- Different governors have different prices
- Each governor acts a bit different