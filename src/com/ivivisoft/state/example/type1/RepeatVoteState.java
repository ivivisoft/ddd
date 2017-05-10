package com.ivivisoft.state.example.type1;

/**
 * Created by andy on 2017/5/9.
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("请不要重复投票！");
    }
}
