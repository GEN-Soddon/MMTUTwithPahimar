MMTUTwithPahimar
================

Let's Mod Reboot with Pahimar Walk Through

From this series I hope to create a mod to make wood stronger.  This is an early game idea to help with creepers.

I learn from working along with Tutorials.  Check out Pahimar on Youtube or 
at http://www.pahimar.com/tutorials/lets-mod/

Episode 1 Complete, unable to get Minecraft to Launch Some modification required on Mac
            
            -Make sure SDK 7 for JAVA is installed before running Gradlew
            
            -Gradle is not launching with client or server.
            
            -IntelliJ is loaded and open MMTUTwithPahimar
            
Episode 2 Complete, Fixed issues with launching client.
            
            -Fall these instruction for setup http://www.minecraftforge.net/wiki/Installation/Source
            
            -Minecraft crashes if username and password are set.
            
Episode 3 Complete, mod loaded without problems.

Episode 4 Complete, mod loaded with mcmod.info file correctly

Episode 5 Complete, proxy and reference add and working

Episode 6 Complete, configuration ConfigValue don't forget to remove boolean when you add get boolean to line.

Episode 7 and 7.5 Complete, glad I have watched all videos before starting to walk through live.  
I remembered that an issue in 7 was corrected in 7.5

        -I am just a few videos away from being able to create my own mod.  Will start creating textures this week.
        
Episode 8 Complete, Add stone Dust.  Need to update to better image before righting live mod.

Episode 9 Complete, Add Stone Oak Log with side and top textures.

        -Need to clean up code.  Must be a better way to handle overrides.
        
        -Maybe change out block to blockLog so logs can be rotated.
        
        -Increase the resistance to an explosion breaking it.
        
Before moving further I spent time working on getting my minecraft user into my Dev World. With much testing I figured 
it out.
        
        -you have to add a to vm options -Djava.library.path= and point it at your natives folder for the project.  
        Easy way is to right click and past path after typing equal sign in.
        
        -next program arguments use --username=username@minecraft.net "your email address" and --password=123456 
        "your password, note it will display your password."
        
       -sorry no screenshots. You should be able to figure out.  
        
        
        