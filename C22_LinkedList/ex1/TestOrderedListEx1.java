package JavaPracticeGitHub.C22_LinkedList.ex1;

public class TestOrderedListEx1 {

    public static void main(String[] args) {


        OrderedListEx1<Town> orderedTownsList = new OrderedListEx1<>();
        //populate list with towns:
        orderedTownsList.addInOrderedList(new Town("Timisoara", 100));
        orderedTownsList.addInOrderedList(new Town("Arad", 150));
        orderedTownsList.addInOrderedList(new Town("Bucuresti", 0));
        orderedTownsList.addInOrderedList(new Town("Ploiesti", 20));

        System.out.println(orderedTownsList);
    }
}
