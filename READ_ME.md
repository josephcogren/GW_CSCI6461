GW_CSCI6461
This is Group 1's CSCI 6461 Java-Based Machine Simulator project. As of 9/24/21, our machine is broken up into two distinct prodcuts: a CPU and a GUI.

The CPU is currently constructed of a controller, General Purpose Registerss, Index Registers, Instruction Registers, Memory, a Memory Address Register, a Memory Buffer Register, and a Program Counter, a Machine Fault Register. (For more information, please see the inline comments of the individual .java files for more information). Each component is designed with the intetion of creating a basic machine architecture, capable of loading, storing, halt and resetting the system.

The GUI is currently constructed with Java Swing - a GUI library - in order to provide interactions with the actual CPU itself. The GUI shows a physical representaiton of the MAR, MBR, and the PC, while also allowing the user to manually input instructions, register info, and manually load/stores with each of the primary componenets. Additionally, there are number converters that support hex to decimal, decimal to binary, and binary to decimal integrated throughout the GUI for ease of use, human-readibility, and CPU compatibility.

INSTRUCTIONS FOR PART 1

Starting the GUI: Put the IPL.txt and the Team1.jar in the same folder, and use the terminal instruction "java -jar Team1.jar" to start the machine (not double click). Then press the IPL button and machine can be initial or restarted.

Using the Instruction Input: The main Instruction input is designated by the individual boxes along the bottom of the screen, with each "bit" corresponding to the location listed below. In order to use this Instruction Input, enter a valid command instrution set into the text boxes above it, using the appropriate combination of binary digits. (the textbox above will only display and not be used for input)

Using the LD Buttons: After the appropriate instruciton has been set in the Instrcution Input, hitting the corresponding LD button next to the register indicated in the Instruction Input (can be a data) will set that register in the CPU and display that value in the proper register in the GUI.

Using the Load & Store Buttons: If the Instruction Input has a 1 (Load) or a 2 (store) in the opperation code, then the CPU will execute the Load/Store according to the instrution input. Otherwise, it will result in a machine error and will result a machine fault and the machine fault index will be displayed in the textbox above.(Memory address error will be machine fault 0 and 3, opcode doesn't match 1 or 2 or 3 will be machine fault 2) And the machine will halt, the instruction will not run anymore, then the only thing needed to do is press the IPL button and restart the machine.

IPL.txt: In order to load the IPL.txt file, please put the IPL.txt and the Team1.jar in the same folder and use the terminal instruction "java -jar Team1.jar" to start the machine (not double click). And the jar file can not access the reserved location in memory.

Running IPL: In order to run the commands in the IPL.txt, ensure the IPL.txt is in the same folder with Team1.jar and contents desired in hex. Then, press the IPL button - this will reset the CPU and create a fresh environment. The CPU will then run a single cycle and wait for user to click the SS button. Each time, you will see the GUI update with the resulting information per each instruction. Continue to iterate by pressing SS until the contents of the file is exhausted and the machine will halt.

Memory address: the IPL.txt will be loaded start from location 7. Any instruction from the GUI input or IPL.txt which try to access address less than 7 or bigger than 2048 will result machine fault 0 or 3, and then machine will halt and need to be resarted by pressing the IPL button. (the machine fault index will be displayed in the textbox above.)

OPcode: the opcode in the machine right now are only load, store and halt which are 1, 2, 3. Any other opcode inputed will result a machine fault 2 and the machine will halt.