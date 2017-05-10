package com.ivivisoft.state.example.type1;

/**
 * Created by andy on 2017/5/9.
 */
public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //恶意投票
        String s = voteManager.getMapVote().get(user);
        if (s!=null){
            voteManager.getMapVote().remove(user);
        }
        System.out.println("你有恶意刷票的嫌疑，取消投票资格");
    }
}
