package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Article;
import com.example.repository.ArticleRepository;


/**
 * 記事関連サービスクラス.
 * 
 * @author igamasayuki
 *
 */
@Service
public class ArticleService {

	@Autowired
	private ArticleRepository articleRepository;

	/**
	 * 投稿一覧を取得します.
	 * 
	 * @return 記事一覧情報
	 */
	public List<Article> findAll() {
		return articleRepository.findAll();
	}

	/**
	 * 記事を登録します.
	 * 
	 * @param article
	 *            記事情報
	 * @return 登録した記事情報
	 */
	public void save(Article article) {
		articleRepository.insert(article);
	}

	
}
