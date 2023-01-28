import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Solution {
    int solution(String beginWord, String endWord, String[] wordList) {

        Set<String> wordSet = new HashSet<>(Arrays.asList(wordList));

        if (!wordSet.contains(endWord))
            return 0;

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        Map<String, Integer> distanceMap = new HashMap<>();
        distanceMap.put(beginWord, 1);

        // use a set to store the words that has been visited
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        while (!queue.isEmpty()) {

            String currWord = queue.poll();

            for (int i = 0; i < currWord.length(); i++) {

                char[] wordChars = currWord.toCharArray();

                for (char j = 'a'; j <= 'z'; j++) {
                    wordChars[i] = j;
                    String transformed = new String(wordChars);

                    if (transformed.equals(endWord)) {

                        for (Map.Entry<String, Integer> d : distanceMap.entrySet()) {
                            System.out.println(d.getKey() + ": " + d.getValue());
                        }

                        return distanceMap.get(currWord) + 1;
                    }

                    if (wordSet.contains(transformed) && !visited.contains(transformed)) {
                        queue.offer(transformed);
                        visited.add(transformed);
                        distanceMap.put(transformed, distanceMap.get(currWord) + 1);
                    }
                }
            }
        }

        // if there is no where to reached the endWord
        return 0;
    }
}