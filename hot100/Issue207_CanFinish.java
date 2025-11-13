package hot100;

import java.util.*;

public class Issue207_CanFinish {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, Deque<Integer>> map = new HashMap<>();
        for (int i = 0; i < prerequisites.length; i++) {
            Deque<Integer> list = map.getOrDefault(prerequisites[i][1], new LinkedList<>());
            list.add(prerequisites[i][0]);
            map.put(prerequisites[i][1], list);
        }

        HashSet<Integer> visited = new HashSet<>();

        for (int i = 0; i < numCourses; i++) {
            if (visited.contains(i)) continue;
            HashSet<Integer> visiting = new HashSet<>();
            if (!dfs(i, map, visiting, visited)) return false;
        }
        return true;
    }

    private static boolean dfs(int course, HashMap<Integer, Deque<Integer>> map,
                               HashSet<Integer> visiting, HashSet<Integer> visited) {
        if (visiting.contains(course)) return false; // 当前路径出现环
        if (visited.contains(course)) return true;   // 已经安全，无环

        visiting.add(course);
        for (int next : map.getOrDefault(course, new LinkedList<>())) {
            if (!dfs(next, map, visiting, visited)) return false;
        }
        visiting.remove(course);
        visited.add(course);
        return true;
    }



    }
