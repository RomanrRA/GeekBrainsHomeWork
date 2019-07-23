package lesson_3.homeWork_3.firstTask;

public class StartParty {
    public static void main(String[] args) {
        CreateArray createArray = new CreateArray();
        HereSortMagic hereSortMagic = new HereSortMagic();

        createArray.setStates();
        System.out.println(createArray.getStates());

        hereSortMagic.showUniqeElementInArrayList(createArray.getStates());

        hereSortMagic.showCountElementsInArrayList(createArray.getStates());

    }
}
