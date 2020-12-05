package com.projects.linkedtree;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Node<String> root = new Node<>("/user/rt/courses/");
		
		//lvl 1
		Node<String> cs016 = new Node<>("cs016/");
		Node<String> cs252 = new Node<>("cs252/");
		root.addChild(cs016);
		root.addChild(cs252);
		//lvl 2
		// left
		Node<String> hw = new Node<>("homeworks/");
		Node<String> prgm = new Node<>("programs/");
		cs016.addChild("grades");
		cs016.addChild(hw);
		cs016.addChild(prgm);
		// right
		Node<String> prj = new Node<>("projects/");
		cs252.addChild(prj);
		cs252.addChild("grades");
		//lvl 3
		//left
		hw.addChild("h1");
		hw.addChild("h2");
		hw.addChild("h3");
		prgm.addChild("pr1");
		prgm.addChild("pr2");
		prgm.addChild("pr3");
		//right
		Node<String> papers = new Node<>("papers/");
		Node<String> demos = new Node<>("demos/");
		prj.addChild(papers);
		prj.addChild(demos);
		
		//lvl 4
		papers.addChild("buylow");
		papers.addChild("sellhigh");
		demos.addChild("market");
		
		
		
			
		
		
	System.out.println(root.getData());
				
	
	for(Node node : root.getChildren()) {
		System.out.println(node.getData());
	}
	}
}
