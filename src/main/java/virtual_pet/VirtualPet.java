//package virtual_pet;
//
//public class VirtualPet {
//
//// instance variables
//
//    private String name;
//    private String type;
//    private int age;
//    private int hungerLevel;
//    private int happyLevel;
//
//// constructor
//
//    public VirtualPet(String name, String type, int age, int hungerLevel, int happyLevel) {
//        this.name = name;
//        this.type = type;
//        this.age = age;
//        this.hungerLevel = hungerLevel;
//        this.happyLevel = happyLevel;
//    }
//
//// getters
//
//    public String getName() {
//        return name; }
//
//    public String getType() {
//        return type;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public int getHungerLevel() {
//        return hungerLevel;
//    }
//
//    public int getHappyLevel() {
//        return happyLevel;
//    }
//
//
//// methods
//
//    public void normalize() {
//        hungerLevel = 5;
//        happyLevel = 5;
//    }
//
//    public void walk() {
//        if (getType().equalsIgnoreCase("Rock")) {
//            System.out.println("\n" +
//                    "           .|+.\n" +
//                    "         .' |  '.\n" +
//                    "        J   |    '.\n" +
//                    "        L  .+.     '.\n" +
//                    "       J .'   '.     '+\n" +
//                    "       +' .'|'. '+.    \\\n" +
//                    "        '+  |  \"+  '+.  \\\n" +
//                    "         F  |   J     '. \\\n" +
//                    "         F  |    L  .+. ';+\n" +
//                    "        J   |    |.'  L';\n" +
//                    "        J   |     L   J  L\n" +
//                    "        |   |     |    L  L\n" +
//                    "        F   |     J    J  J\n" +
//                    "        F   |      L    L  L\n" +
//                    "_______J    |      |    J   |__________\n" +
//                    "       J    |      J     L   L\n" +
//                    "       |    |       L--.,;,--'\n" +
//                    "       +._  |    _,.+\n" +
//                    "          '-|,.-'      ");
//            hungerLevel++;
//            happyLevel += 2;
//            System.out.println(getName() + " gets a little hungrier and a little happier!");
//        }
//        if (getType().equalsIgnoreCase("Wolf")) {
//            System.out.println("\n" +
//                    "                            .d$$b\n" +
//                    "                          .' TO$;\\\n" +
//                    "                         /  : TP._;\n" +
//                    "                        / _.;  :Tb|\n" +
//                    "                       /   /   ;j$j\n" +
//                    "                   _.-\"       d$$$$\n" +
//                    "                 .' ..       d$$$$;\n" +
//                    "                /  /P'      d$$$$P. |\\\n" +
//                    "               /   \"      .d$$$P' |\\^\"l\n" +
//                    "             .'           `T$P^\"\"\"\"\"  :\n" +
//                    "         ._.'      _.'                ;\n" +
//                    "      `-.-\".-'-' ._.       _.-\"    .-\"\n" +
//                    "    `.-\" _____  ._              .-\"\n" +
//                    "   -(.g$$$$$$$b.              .'\n" +
//                    "     \"\"^^T$$$P^)            .(:\n" +
//                    "       _/  -\"  /.'         /:/;\n" +
//                    "    ._.'-'`-'  \")/         /;/;\n" +
//                    " `-.-\"..--\"\"   \" /         /  ;\n" +
//                    ".-\" ..--\"\"        -'          :\n" +
//                    "..--\"\"--.-\"         (\\      .-(\\\n" +
//                    "  ..--\"\"              `-\\(\\/;`\n" +
//                    "    _.                      :\n" +
//                    "                            ;`-\n" +
//                    "                           :\\\n" +
//                    "                           ;  ");
//            hungerLevel++;
//            happyLevel += 2;
//            System.out.println(getName() + " gets a little hungrier and a little happier!");
//        }
//        if (getType().equalsIgnoreCase("Dragon")) {
//            System.out.println("" +
//                    "                            ==(W{==========-      /===-                        \n" +
//                    "                              ||  (.--.)         /===-_---~~~~~~~~~------____  \n" +
//                    "                              | \\_,|**|,__      |===-~___                _,-' `\n" +
//                    "                 -==\\\\        `\\ ' `--'   ),    `//~\\\\   ~~~~`---.___.-~~      \n" +
//                    "             ______-==|        /`\\_. .__^\\ \\    | |  \\\\           _-~`         \n" +
//                    "       __--~~~  ,-/-==\\\\      (   | .  |~~~~|   | |   `\\        ,'             \n" +
//                    "    _-~       /'    |  \\\\     )__/==0==-\\<>/   / /      \\      /               \n" +
//                    "  .'        /       |   \\\\      /~\\___/~~\\/  /' /        \\   /'                \n" +
//                    " /  ____  /         |    \\`\\.__/-~~   \\  |_/'  /          \\/'                  \n" +
//                    "/-'~    ~~~~~---__  |     ~-/~         ( )   /'        _--~`                   \n" +
//                    "                  \\_|      /        _) | ;  ),   __--~~                        \n" +
//                    "                    '~~--_/      _-~/- |/ \\   '-~ \\                            \n" +
//                    "                   {\\__--_/}    / \\\\_>-|)<__\\      \\                           \n" +
//                    "                   /'   (_/  _-~  | |__>--<__|      |                          \n" +
//                    "                  |   _/) )-~     | |__>--<__|      |                          \n" +
//                    "                  / /~ ,_/       / /__>---<__/      |                          \n" +
//                    "                 o-o _//        /-~_>---<__-~      /                           \n" +
//                    "                 (^(~          /~_>---<__-      _-~                            \n" +
//                    "                ,/|           /__>--<__/     _-~                               \n" +
//                    "             ,//('(          |__>--<__|     /                  .----_          \n" +
//                    "            ( ( '))          |__>--<__|    |                 /' _---_~\\        \n" +
//                    "         `-)) )) (           |__>--<__|    |               /'  /     ~\\`\\      \n" +
//                    "        ,/,'//( (             \\__>--<__\\    \\            /'  //        ||      \n" +
//                    "      ,( ( ((, ))              ~-__>--<_~-_  ~--____---~' _/'/        /'       \n" +
//                    "    `~/  )` ) ,/|                 ~-_~>--<_/-__       __-~ _/                  \n" +
//                    "  ._-~//( )/ )) `                    ~~-'_/_/ /~~~~~~~__--~                    \n" +
//                    "   ;'( ')/ ,)(                              ~~~~~~~~~~                         \n" +
//                    "  ' ') '( (/                                                                   \n" +
//                    "    '   '  `");
//            hungerLevel ++;
//            happyLevel += 2;
//            System.out.println(getName() + " gets a little hungrier and a little happier!");
//        }
//    }
//
//// mini-game methods
//
//    public void greeting() {
//        System.out.println("Hi, I'm your new Virtual Pet! My name is " + getName() + ", and I'm a " +
//                getType() + ". Each day my hunger will increase by 1, and my happiness will decrease by 1." +
//                "\nIf my hunger rises to 10 or my happiness drops to 0 I will perish! " +
//                "\nIf my happiness reaches 10 you win the game! It won't be easy, I may occasionally act out...");
//    }
//
//    public void status() {
//        System.out.println ("I am " + getAge() + " days old. \nMy hunger level is " +
//                getHungerLevel() + ". \nMy happy level is " +
//                getHappyLevel() + ".");
//    }
//
//    public void feed() {
//        hungerLevel -= 2;
//    }
//
//    public void comfort() {
//        happyLevel += 2;
//    }
//
//    public void bite() {
//        System.out.println(getName() + " bit you! (Hunger - 1 and Happy -2)");
//        hungerLevel --;
//        happyLevel -= 2;
//    }
//
//    public void wallow() {
//        System.out.println("Nothing means anything! Why even try?! (Hunger + 2 and Happy + 1");
//        hungerLevel += 2;
//        happyLevel ++;
//    }
//
//    public void bored() {
//        System.out.println("Every day is the same thing! (Hunger +1 and Happy -1)");
//        hungerLevel ++;
//        happyLevel --;
//    }
//
//    public void birthday() {
//        System.out.println("Let's have some cake! (Hunger -2 and Happy + 2");
//        hungerLevel -= 3;
//        happyLevel += 3;
//    }
//
//    public void tick() {
//        age++;
//        hungerLevel ++;
//        happyLevel --;
//    }
//
//    public void deathMessage() {
//        System.out.println("I am no more. (You lose.)");
//    }
//
//    public void winMessage() {
//        System.out.println("I'm so happy! What else could a " + getType() + " want?! (You win!)");
//    }
//
//}


