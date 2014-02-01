KYLE SCHAEFER

AI project/LoamStory

Instructions:

	For now... just compile Main.java and run Main

Currently working on:

	Implementing a Random maze generator using my own algorithm based off
    of the Randomized Prims algorithm (Prims uses a wall based grid and only checks
    the opposite side of the wall to see if that cell is in the maze or not unlike mine,
    instead I use cells rather than walls and check for all 8 surrounding
    cells, ultimately the  cells will act as "walls" and "maze space" just marked differently)

Files include:

    Directories:

        <Wander AI>

	    Grid.java - Holds methods for creating the grid, marking/unmarking objects etc

	    Main.java - Just runs the current setup as pushed

	    Monst.java - (Should ranme to Wander AI)
		        Contains methods for creating a monster and setting mode to wander AI

	    Maps.java - Pretty cool class to make maps, just set a position in the grid to be marked
		        using markObject(x,y); You can layer them together as well like a map editor or something
  		        Eventually I'll implement it to just read from a file so I can just draw it in a text file

        <Maze Solver>

        includes...

        DFS.java - The roughly done algorithm (Depth-first search) countains a method searchDepth (i think)
                    poorly done but It does work for the most part (there is one bug in there at the moment
                    causes the bot to miss certain spots due to how the stack is handled from the
                    stack class)

        Main.java - main file for running the current setup

        Maps.java - same class from the Wander AI with a few modifications

        Grid.java - same grid class as Wander AI just a few modifications for the better

        Stacks.java - My own implementation of a stack with a push/pop method (poorly done just wanted
                    to get the thing working)

        <Serializer>

            (currently not pushed just being lazy but it is completed)

            description...
                Turns an object into bytecode to be saved (usually as a .ser but doesnt matter)
                onto the disk or where ever you would like to store it, can be deserialized anywhere
                assuming you have the object type that it was serialized into.

                Mine is setup to use just my Grid class simply because thats what I need to serialize
                I created two classes Serilazer.java and Deserializer.java

                Serializer.java - You pass it the name of the file you'd like to store it as and the
                                  Grid object you created

                Deserializer.java - Pass it the fil ename you'd like to restore and bam its done

Future works:

	Implementing a BFS algorithm after the dfs is finished
	There are quite a few other classes I've worked on but nothing worth commiting at this point
