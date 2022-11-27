package programmers;

import main.programmers.MasterPlayingAlone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MasterPlayingAloneTest {
    MasterPlayingAlone masterPlayingAlone;

    @BeforeEach
    void beforeEach() {
        masterPlayingAlone = new MasterPlayingAlone();
    }

    @Test
    public void executeSolution(){
        int[] arr1 = {8,6,3,7,2,5,1,4};
        assertThat(masterPlayingAlone.solution(arr1)).isEqualTo(12);
    }
}
