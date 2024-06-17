package firstPackage;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class jacard_similarity {

 public static void main(String[] args) {
  
  
  //String s1 = "Data is the new oil of the digital economy";
  //String s2 = "Data is a new oil";
  
  List<String> doc1 = Arrays.asList("Data", "is", "the", "new", "oil", "of", "the", "digital", "economy");
  List<String> doc2 = Arrays.asList("Data", "is", "a", "new", "oil");
  
  // Method 1:
        System.out.println("\n\nMethod 1 Results:");
        Collections.sort(doc1);
        Collections.sort(doc2);

        List<String> commonWords = new ArrayList<>();
        Set<String> mergedWords = new HashSet<>();
\




        int i = 0, j = 0;
        while (i < doc1.size() && j < doc2.size()) {
            int comparison = doc1.get(i).compareTo(doc2.get(j));
            if (comparison == 0) {
                commonWords.add(doc1.get(i));
                i++;
                j++;
            } else if (comparison < 0) {
                i++;
            } else {
                j++;
            }
        }

        mergedWords.addAll(doc1);
        mergedWords.addAll(doc2);

        System.out.println("Intersection = " + String.join(",", commonWords));
        System.out.println("Intersection size: " + commonWords.size());

        System.out.println("Union = " + String.join(",", mergedWords));
        System.out.println("Union size: " + mergedWords.size());

        System.out.println("Jaccard Similarity = " + (float) commonWords.size() / mergedWords.size());

        // Method 2:
        System.out.println("\nMethod 2 Results:");

        int count = 0;
        for (String w1 : doc1) {
            for (String w2 : doc2) {
                if (w1.equals(w2)) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Intersection size: " + count);

        Set<String> uniqueWords = new TreeSet<>(doc1);
        uniqueWords.addAll(doc2);

        System.out.println("Union = " + String.join(",", uniqueWords));
        System.out.println("Union size: " + uniqueWords.size());

        System.out.println("Jaccard Similarity = " + (float) count / uniqueWords.size());
    }
}



