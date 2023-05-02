package dk.stonemountain.github.dev.bot;

import java.io.IOException;

import org.kohsuke.github.GHEventPayload;

import io.quarkiverse.githubapp.event.Issue;

public class IssueMonitor {
    void onOpen(@Issue.Opened GHEventPayload.Issue issuePayload) throws IOException {
		issuePayload.getIssue().comment("Hello from my GitHub App");
	}    
}
