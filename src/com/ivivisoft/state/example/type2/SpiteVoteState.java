package com.ivivisoft.state.example.type2;

/**
 * Created by andy on 2017/5/9.
 */
public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //恶意投票
        String s = voteManager.getMapVote().get(user);
        if (s != null) {
            voteManager.getMapVote().remove(user);
        }
        System.out.println("你有恶意刷票的嫌疑，取消投票资格");
        //下一个操作数是8，就应该进入黑名单了
        if (voteManager.getMapVoteCount().get(user) >= 7) {
            voteManager.getVoteStateMap().put(user, new BlackVoteState());
        }
    }
}
