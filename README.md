# GW_CSCI6461
This is Group 1's CSCI 6461 Java-Based Machine Simulator project. As of 9/24/21, our machine is broken up into two distinct prodcuts: a CPU and a GUI. 

The CPU is currently constructed of a controller, General Purpose Registerss, Index Registers, Instruction Registers, Memory, a Memory Address Register, 
a Memory Buffer Register, and a Program Counter. (For more information, please see the inline comments of the individual .java files for more information). 
Each component is designed with the intetion of creating a basic machine architecture, capable of loading, storing, and resetting the system. 

The GUI is currently constructed with Java Swing - a GUI library - in order to provide interactions with the actual CPU itself. 
The GUI shows a physical representaiton of the MAR, MBR, and the PC, while also allowing the user to manually input instructions, register info, and manually 
load/stores with each of the primary componenets. 
Additionally, there are number converters that support hex to decimal, decimal to binary, and binary to decimal integrated throughout the GUI for ease of use,  human-readibility, and CPU compatibility.  

INSTRUCTIONS FOR PART 1 

Starting the GUI: Start the GUI by first extracting the JAR and then navigating to the PanelView.java file inside GWCSCI6461/src/GUI/PanelView. Then, run this file using your IDE's commands. This should start the GUI. 

Using the Instruction Input: The main Instruction input is designated by the individual boxes along the bottom of the screen, with each "bit" corresponding to the location listed below. In order to use this Instruction Input, enter a valid command instrution set into the text boxes above it, using the appropriate combination of binary digits. 

Using the LD Buttons: After the appropriate instruciton has been set in the Instrcution Input, hitting the corresponding LD button next to the register indicated in the Instruction Input will set that register in the CPU and display that value in the proper register in the GUI. Hitting load to another register will not work and the 

Using the Load & Store Buttons: If the Instruction Input has a 1 (Load) or a 2 (store) in the opperation code, then the CPU will execute the Load/Store. Otherwise, it will result in a machine error and will not progress until a new opperation has been inputted. 

IPL.txt: In order to load the IPL.txt file, please EITHER edit the existing IPL.txt file in the main GWCSCI6461 folder OR replace it with another IPL.txt file. The CPU will then handle loading the instructions on its own and it requires no extra work. 

Running IPL: In order to run the commands in the IPL.txt, ensure the IPL.txt is in the GWCSCI6461 folder and that it contains the addresses and contents desired. Then, press the IPL button - this will reset the CPU and create a fresh environment. The CPU will then run a single cycle and wait for user to click the SS button. Each time, you will see the GUI update with the resulting information per each instruction. Continue to iterate by pressing SS until the contents of the file is exhausted. 
