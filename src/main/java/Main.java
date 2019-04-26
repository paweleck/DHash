import com.github.kilianB.hash.Hash;
import com.github.kilianB.hashAlgorithms.AverageHash;
import com.github.kilianB.hashAlgorithms.DifferenceHash;
import com.github.kilianB.hashAlgorithms.HashingAlgorithm;
import com.github.kilianB.hashAlgorithms.PerceptiveHash;

import java.io.File;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    File org = new File("C:\\Users\\Pawel\\IdeaProjects\\DHash\\img\\korg.jpg");
//    File phone = new File("C:\\Users\\Pawel\\IdeaProjects\\DHash\\img\\kfoto.jpg");
    File phone = new File("C:\\Users\\Pawel\\IdeaProjects\\DHash\\img\\diff.jpg");

//    HashingAlgorithm hasher = new PerceptiveHash(32);
//    HashingAlgorithm hasher = new DifferenceHash(64, DifferenceHash.Precision.Simple);
    HashingAlgorithm hasher = new DifferenceHash(64, DifferenceHash.Precision.Triple);
//    HashingAlgorithm hasher = new AverageHash(64);

    Hash hash0 = hasher.hash(org);
    Hash hash1 = hasher.hash(phone);

    double similarityScore = hash0.normalizedHammingDistance(hash1);

    System.out.println("similarityScore: " + similarityScore);
  }
}
