package com.ivivisoft.state.example.type2;

/**
 * Created by andy on 2017/5/9.
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("请不要重复投票！");
        //下一次操作数是5，就应该是恶意投票了
        if (voteManager.getMapVoteCount().get(user) >= 4) {
            voteManager.getVoteStateMap().put(user, new SpiteVoteState());
        }
    }
}
