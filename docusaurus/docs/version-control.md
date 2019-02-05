---
id: version-control
title: Version Control
---

> What’s a version control system?
> 
> A version control system, or VCS, tracks the history of changes as people and teams collaborate on projects together. As the project evolves, teams can run > tests, fix bugs, and contribute new code with the confidence that any version can be recovered at any time. Developers can review project history to find out:
> 
> - Which changes were made?
> - Who made the changes?
> - When were the changes made?
> - Why were changes needed?

Source: [Git Handbook - guides.github.com](https://guides.github.com/introduction/git-handbook/)

For more information on [Git]

## Git
[Git](https://en.wikipedia.org/wiki/Git) is a distributed version control system for tracking changes in source code during software development - Wikipedia.

If used correctly Git and GitHub will provide you with the following:
- Ability to revert to the previous version of code that worked.
- Backup of your source code in case of user error or hardware failure.
- Easily clone your source code on another machine to continue working.
- Collaboration for non COS 212 related projects.
- Less headaches (after you learn the basics of Git)

So go ahead and install git:
```sh
sudo dnf install git
```

For more information on Git, read the [Git Handbook](https://guides.github.com/introduction/git-handbook/) on GitHub.

## GitHub
> [GitHub](https://github.com/) is a Git hosting repository that provides developers with tools to ship better code through command line features, issues (threaded discussions), pull requests, code review.

Source: [Git Handbook - guides.github.com](https://guides.github.com/introduction/git-handbook/)

GitHub will host your git repositories, allowing you to clone them to any device to continue work.

1. Create a GitHub account

## Configuring Git
Commits you make need to be associated with your GitHub account.

```sh
# Your First and last name
git config --global user.name "John Doe"

# The email you used to register for GitHub
git config --global user.email "john.doe@example.com"
```

### Further Reading
- [Caching your GitHub password in Git](https://help.github.com/articles/caching-your-github-password-in-git/)

