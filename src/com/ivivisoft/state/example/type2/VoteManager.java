package com.ivivisoft.state.example.type2;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by andy on 2017/5/8.
 */
public class VoteManager {


    @Getter
    private Map<String, String> mapVote = new HashMap<>();
    @Getter
    private Map<String, Integer> mapVoteCount = new HashMap<>();
    @Getter
    private Map<String, VoteState> voteStateMap = new HashMap<>();

    public void vote(String user, String voteItem) {
        Integer oldVoteCount = mapVoteCount.get(user);
        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }
        oldVoteCount = oldVoteCount + 1;
        mapVoteCount.put(user, oldVoteCount);
        VoteState voteState = voteStateMap.get(user);
        if (voteState == null) {
            voteState = new NormalVoteState();
        }

        voteState.vote(user, voteItem, this);
    }

}
