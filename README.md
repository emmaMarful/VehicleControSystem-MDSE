# VehicleControSystem-MDSE
This repository contains a Model-Driven Software Engineering (MDE) tool developed using Eclipse Sirius and EMF (Ecore) to design and validate Vehicle Control Unit (VCU) architectures. The tool allows users to architect sensor-actuator networks, specifically modeled after the Elegoo 37 Sensor Kit V2.0 for this project.



#Project Overview
This repository contains a Model-Driven Engineering (MDE) tool developed using Eclipse Sirius and EMF (Ecore) to design and validate Vehicle Control Unit (VCU) architectures. The tool allows users to architect sensor-actuator networks, specifically modeled after the Elegoo 37 Sensor Kit V2.0, including components like Passive Buzzers, buttons, LED, Photoresistors (KY-018), and Ultrasonic Sensors.

#Key Features
Dynamic Properties View: Customized property pages and groups for every hardware component, allowing for precise attribute configuration (e.g., Pin Numbers, Voltages, and Sensor Thresholds).

Integrated Java Services: A custom Java-based testing framework that allows for real-time interaction with model elements via AQL (Acceleo Query Language) expressions.

Advanced Semantic Validation: Automated rules to ensure hardware integrity, such as detecting duplicate pin assignments and validating sensor-to-pin compatibility.

Adaptive Systems Modeling: Built-in support for modeling complex behaviors like Adaptive Headlights triggered by ambient light intensity (LDR/Photoresistor).

#Technical Stack
Meta-modeling: Ecore (EMF)

Representation: Eclipse Sirius (Diagrams & Properties)

Query Language: AQL (Acceleo Query Language)

Logic: Java Services
