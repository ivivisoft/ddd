package com.ivivisoft.state.example.type1;

/**
 * Created by andy on 2017/5/8.
 */
public class NormalVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        voteManager.getMapVote().put(user,voteItem);
        System.out.println("恭喜你投票成功！");
    }
}
