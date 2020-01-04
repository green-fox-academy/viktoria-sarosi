import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WeeklyFeedbackEvaluator {
    public static void main(String[] args) {
        Path filepath = Paths.get("Feedback.txt");
        System.out.println(getAverageRating(filepath));
        for(String key: getAverageRating(filepath).keySet()){
            System.out.println(key + ": " + getAverageRating(filepath).get(key));
        }
    }

    private static HashMap<String, Float> getAverageRating(Path filepath) {
        HashMap<String, Float> averageMap = new HashMap<>();
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        float matReviewSum = 0;
        float presSkillsSum = 0;
        float helpfullnessSum = 0;
        float explanationSum = 0;

        for (int i = 0; i < lines.size(); i++) {
            String[] lineparts = lines.get(i).split(" ");
            matReviewSum += Float.parseFloat(lineparts[0]);
            presSkillsSum += Float.parseFloat(lineparts[1]);
            helpfullnessSum += Float.parseFloat(lineparts[2]);
            explanationSum += Float.parseFloat(lineparts[3]);
        }
        float matReviewAverage = matReviewSum / lines.size();
        float presSkillsAverage = presSkillsSum / lines.size();
        float helpfullnessAverage = helpfullnessSum / lines.size();
        float explanationAverage = explanationSum / lines.size();

        averageMap.put("matReview", matReviewAverage);
        averageMap.put("presSkills", presSkillsAverage);
        averageMap.put("helpfulness", helpfullnessAverage);
        averageMap.put("explanations", explanationAverage);

        return averageMap;
    }

}
