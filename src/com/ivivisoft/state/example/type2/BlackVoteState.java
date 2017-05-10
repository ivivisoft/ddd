package com.ivivisoft.state.example.type2;

/**
 * Created by andy on 2017/5/9.
 */
public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("进入黑名单，将禁止登录和使用本系统！");
    }
}
