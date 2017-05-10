package com.ivivisoft.state.example.type1;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by andy on 2017/5/8.
 */
public class VoteManager {

    private VoteState voteState = null;
    @Getter
    private Map<String, String> mapVote = new HashMap<>();
    private Map<String, Integer> mapVoteCount = new HashMap<>();

    public void vote(String user, String voteItem) {
        Integer oldVoteCount = mapVoteCount.get(user);
        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }
        oldVoteCount = oldVoteCount + 1;
        mapVoteCount.put(user, oldVoteCount);
        if (oldVoteCount == 1) {
            voteState = new NormalVoteState();
        } else if (oldVoteCount > 1 && oldVoteCount < 5) {
            voteState = new RepeatVoteState();
        } else if (oldVoteCount >= 5 && oldVoteCount < 8) {
            voteState = new SpiteVoteState();
        } else if (oldVoteCount >= 8) {
            voteState = new BlackVoteState();
        }
        voteState.vote(user, voteItem, this);
    }

}
