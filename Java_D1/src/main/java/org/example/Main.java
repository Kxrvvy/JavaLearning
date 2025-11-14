package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Learning Static
            /* para syang dorm na nag ccontain ng tenants. lahat ng tenants na nandun sa dorm ay
                mabibiang ni static. Pero kapag tinanggal mo ung static; parang ginawa mo ay binigyan
                mo ng tig iisang kwarto/container ung mga tenant. so need mo isa-isahin ang 'numberOfFriends'.*/

        // This is called Instances
        Friends friend1 = new Friends("Spongebob");
        Friends friend2 = new Friends("patrick");
        Friends friend3 = new Friends("Squidward");
        Friends friend4 = new Friends("Sandy");

        System.out.println(Friends.numberOfFriends);

        // Using methods

        Friends.displayFriends();

        // -----------------------------------------------------------------------------------------------------------



    }
}