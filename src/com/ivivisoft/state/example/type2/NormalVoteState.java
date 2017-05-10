package com.ivivisoft.state.example.type2;

/**
 * Created by andy on 2017/5/8.
 */
public class NormalVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜你投票成功！");
        //正常投票完成，维护下一个状态，同一个人再投票就重复了
        voteManager.getVoteStateMap().put(user, new RepeatVoteState());
    }
}
