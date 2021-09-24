# GW_CSCI6461
This is Group 1's CSCI 6461 Java-Based Machine Simulator project. As of 9/24/21, our machine is broken up into two distinct prodcuts: a CPU and a GUI. 

The CPU is currently constructed of a controller, General Purpose Registerss, Index Registers, Instruction Registers, Memory, a Memory Address Register, 
a Memory Buffer Register, and a Program Counter. (For more information, please see the inline comments of the individual .java files for more information). 
Each component is designed with the intetion of creating a basic machine architecture, capable of loading, storing, and resetting the system. 

The GUI is currently constructed with Java Swing - a GUI library - in order to provide interactions with the actual CPU itself. 
The GUI shows a physical representaiton of the MAR, MBR, and the PC, while also allowing the user to manually input instructions, register info, and manually 
load/stores with each of the primary componenets. 
Additionally, there are number converters that support hex to decimal, decimal to binary, and binary to decimal integrated throughout the GUI for ease of use and visibility.  
