package kr.kh.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.spring.dao.BoardDAO;
import kr.kh.spring.vo.BoardTypeVO;

@Service
public class AdminServiceImp implements AdminService {
	
	@Autowired
	BoardDAO boardDao;
	
	@Override
	public ArrayList<BoardTypeVO> getBoardType() {
		
		return boardDao.selectAllBoardType(9);
	}

	@Override
	public boolean insertBoardType(BoardTypeVO bt) {
		//공백을 제거해서 길이가 0이면 등록못하게
		if(bt == null || bt.getBt_name().trim().length() == 0)
			return false;
		try {
			return boardDao.insertBoardType(bt);
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateBoardType(BoardTypeVO bt) {
		if(bt == null || bt.getBt_name().trim().length() == 0)
			return false;
		return boardDao.updateBoardType(bt);
	}
	
}
