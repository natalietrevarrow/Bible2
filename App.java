public class App {
    public static void main(String[] args) throws Exception {
        Convert(13, 7700000000L, 0);
    }

    public static int Convert(double parentDisciplePop, double parentRegPop, int parentAge) {
        //initialize child variables
        double childDisciplePop = 0;
        double childRegPop = 0;
        int childAge = 0;
        boolean childActive = false;
        
        //initialize grandchild array
        double grandDisciplePop = 0;
        double grandRegPop = 0;
        int grandAge = 0;
        boolean grandActive = false;
        
        //initialize overall variables
        double overallPop = 7700000000L;
        double overallDisciplePop = parentDisciplePop;
        int time = 0;

        while(overallPop > overallDisciplePop) {
            //parent lifecycle
            if(parentAge >= 18) {
                parentDisciplePop = overallDisciplePop * Math.pow(3, (time%18)%3);
            }

            if(parentAge == 30) {
                childDisciplePop = 0;
                childRegPop = parentRegPop/2;
                childActive = true;
            }

            if(parentAge == 72) {
                overallPop = overallPop - parentRegPop;
                overallDisciplePop = overallDisciplePop - parentDisciplePop;
            }

            //child lifecycle
            if(childAge >= 18) {
                childDisciplePop = overallDisciplePop * Math.pow(3, (time%18)%3);
            }

            if(childAge == 30) {
                grandDisciplePop = 0;
                grandRegPop = childRegPop/2;
                grandActive = true;
            }

            if(childAge == 72) {
                overallPop = overallPop - childRegPop;
                overallDisciplePop = overallDisciplePop - childDisciplePop;
            }

            //grandchild lifecycle
            if(grandAge >= 18) {
                grandDisciplePop = overallDisciplePop * Math.pow(3, (time%18)%3);
            }

            if(grandAge == 30) {
                //move child to parent
                parentDisciplePop = childDisciplePop;
                parentRegPop = childRegPop;
                parentAge = childAge;

                //move grandchild to child
                childDisciplePop = grandDisciplePop;
                childRegPop = grandRegPop;
                childAge = grandAge;
            }

            //increment time
            time = time + 1;

            //increment ages
            parentAge = parentAge + 1;
            if(childActive == true) {
                childAge = childAge + 1;
            }
            if(grandActive == true) {
                grandAge = grandAge + 1;
            }
            
        }
        System.out.println("Years taken to covert entire population: " + time);
        return time;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Convert(13, 7700000000L, 0);
    }

    public static int Convert(double parentDisciplePop, double parentRegPop, int parentAge) {
        //initialize child variables
        double childDisciplePop = 0;
        double childRegPop = 0;
        int childAge = 0;
        boolean childActive = false;
        
        //initialize grandchild array
        double grandDisciplePop = 0;
        double grandRegPop = 0;
        int grandAge = 0;
        boolean grandActive = false;
        
        //initialize overall variables
        double overallPop = 7700000000L;
        double overallDisciplePop = parentDisciplePop;
        int time = 0;

        while(overallPop > overallDisciplePop) {
            //parent lifecycle
            if(parentAge >= 18) {
                parentDisciplePop = overallDisciplePop * Math.pow(3, (time%18)%3);
            }

            if(parentAge == 30) {
                childDisciplePop = 0;
                childRegPop = parentRegPop/2;
                childActive = true;
            }

            if(parentAge == 72) {
                overallPop = overallPop - parentRegPop;
                overallDisciplePop = overallDisciplePop - parentDisciplePop;
            }

            //child lifecycle
            if(childAge >= 18) {
                childDisciplePop = overallDisciplePop * Math.pow(3, (time%18)%3);
            }

            if(childAge == 30) {
                grandDisciplePop = 0;
                grandRegPop = childRegPop/2;
                grandActive = true;
            }

            if(childAge == 72) {
                overallPop = overallPop - childRegPop;
                overallDisciplePop = overallDisciplePop - childDisciplePop;
            }

            //grandchild lifecycle
            if(grandAge >= 18) {
                grandDisciplePop = overallDisciplePop * Math.pow(3, (time%18)%3);
            }

            if(grandAge == 30) {
                //move child to parent
                parentDisciplePop = childDisciplePop;
                parentRegPop = childRegPop;
                parentAge = childAge;

                //move grandchild to child
                childDisciplePop = grandDisciplePop;
                childRegPop = grandRegPop;
                childAge = grandAge;
            }

            //increment time
            time = time + 1;

            //increment ages
            parentAge = parentAge + 1;
            if(childActive == true) {
                childAge = childAge + 1;
            }
            if(grandActive == true) {
                grandAge = grandAge + 1;
            }
            
        }
        System.out.println("Years taken to covert entire population: " + time);
        return time;
    }
}
