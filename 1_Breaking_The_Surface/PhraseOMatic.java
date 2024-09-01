package Breaking_The_Surface;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = { "agnostic", "opinionated",
                "voice activated", "haptically driven", "extensible",
                "reactive", "agent based", "functional", "AI enabled",
                "strongly typed" };

        String[] wordListTwo = { "loosely coupled", "six sigma",
                "asynchronous", "event driven", "pub-sub", "IoT", "cloudative", "service oriented", "containerized",
                "serverless",
                "microservices", "distributed ledger" };

        String[] wordListThree = { "framework", "library",
                "DSL", "REST API", "repository", "pipeline", "service mesh", "architecture", "perspective", "design",
                "orientation" };

        int wordListOneLength = wordListOne.length;
        int wordListTwoLength = wordListTwo.length;
        int wordListThreeLength = wordListThree.length;

        java.util.Random randomGenerator = new java.util.Random();

        int rand1 = randomGenerator.nextInt(wordListOneLength);
        int rand2 = randomGenerator.nextInt(wordListTwoLength);
        int rand3 = randomGenerator.nextInt(wordListThreeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);
    }
}