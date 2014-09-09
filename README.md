Advanced Topics Student Repo Template
===================
This is a base repo for a student work space in Advanced Topics in Computer Science at St. Mark's.

  - ObjectDraw (supporting _Eventful Java_) and GridWorld (supporting the AP Computer Science A Exam) are both included.
  - Because Eclipse doesn't seem to support relative paths for User Libraries (or, at least, not easily), the settings for the libraries are included as Libraries.userLibraries, which will need to be imported at the outset. (And, probably, the actual JAR files will need to be relinked in Eclipse > Preferences > Java > Build Path > User Libraries)
  - To bulk-create student repos, the easy way is to follow [these directions](https://help.github.com/articles/duplicating-a-repository), with the modification that you don't need to create multiple temporary repos -- just mirror-push the same temp back to each student's repo.
  
In terms of GitHub organizational structure, it's useful to have a team for each repo, with write access to the student repo and the student as the sole member (the teacher is, presumably, in the owners team and doesn't need to be in the student teams... although one could certainly do that).
